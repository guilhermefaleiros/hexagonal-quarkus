package application.rest;

import application.usecases.UserFindByIdAdapter;
import core.models.dto.UserDetailDTO;
import core.ports.rest.UserControllerPort;
import core.ports.usecases.UserFindByIdPort;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserControllerAdapter implements UserControllerPort<Response> {

    UserFindByIdPort userFindById;

    @Inject
    public UserControllerAdapter(UserFindByIdAdapter userFindById) {
        this.userFindById = userFindById;
    }

    @Override
    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
        UserDetailDTO userDetailDTO = this.userFindById.execute(id);
        return Response.ok().entity(userDetailDTO).build();
    }
}
