package com.courses.controllers.client.joinGroup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.courses.services.GroupService;

/**
 * Servlet implementation class AddMemberToGroup
 */
@WebServlet(urlPatterns = { "/add-member-to-group", "/add-member-to-group/" })
public class AddMemberToGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddMemberToGroup() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GroupService groupService = new GroupService(request, response);
		groupService.addMemberToGroup();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
