package com.xpec.ci.web_server_ci.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import com.xpec.ci.web_server_ci.ops.Ops;

public class SumHandler extends AbstractHandler{

	public void handle(String target, Request baseRequest, 
			HttpServletRequest request, 
			HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		int x = (int)(Math.random()*10);
		int y = (int)(Math.random()*10);
		int result = new Ops().sum(x, y);
		response.getWriter().println("{\"x\": "+x+", \"y\": "+y+", \"sum\": "+result+"}");
	}

}