package com.mesosphere.sdk.redis.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Path;

/**
 * A read-only API for accessing file artifacts (e.g. config templates) for retrieval by executors.
 */
@Path("/v1/monitor")
public class RedisMonitorResource {
  private static final String VIP_POST_FIX = ".l4lb.thisdcos.directory";

  private final Logger logger = LoggerFactory.getLogger(getClass());

  private String proxyHost;

  public RedisMonitorResource(String name) {
    this.proxyHost = "proxy." + name + VIP_POST_FIX;
    logger.debug("Monitor redis at " + proxyHost);
  }

}
