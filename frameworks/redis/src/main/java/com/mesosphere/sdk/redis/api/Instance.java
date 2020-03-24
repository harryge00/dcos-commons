package com.mesosphere.sdk.redis.api;

import com.mesosphere.sdk.http.ResponseUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * API for redis instance status
 * TODO (drakemin): currently not in use.
 */

@Path("/v0/instance")
public class Instance {
  private static final Logger log = LoggerFactory.getLogger(Instance.class);

  private static final String OK_RESPONSE = "ok";


  @GET
  @SuppressWarnings("checkstyle:IllegalCatch")
  public Response list() {
    try {
      return ResponseUtils.plainOkResponse(OK_RESPONSE);
    } catch (Exception ex) {
      log.error("Failed to fetch list with exception: " + ex);
      return Response.serverError().build();
    }
  }

  @GET
  @Path("/master")
  @SuppressWarnings("checkstyle:IllegalCatch")
  public Response master() {
    try {
      return ResponseUtils.plainOkResponse(OK_RESPONSE);
    } catch (Exception ex) {
      log.error("Failed to fetch master with exception: " + ex);
      return Response.serverError().build();
    }
  }

  @GET
  @Path("/slaves")
  @SuppressWarnings("checkstyle:IllegalCatch")
  public Response slaves() {
    try {
      return ResponseUtils.plainOkResponse(OK_RESPONSE);
    } catch (Exception ex) {
      log.error("Failed to fetch slaves with exception: " + ex);
      return Response.serverError().build();
    }
  }
}
