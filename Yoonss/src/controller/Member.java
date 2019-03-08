package controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.naming.Context;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Member extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect(req.getContextPath()+"/DataRoom/Member.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DataRoomDTO dto = new DataRoomDTO();
		dto.setId(req.getParameter("id"));
		dto.setPwd(req.getParameter("password"));
		dto.setName(req.getParameter("name"));
		dto.setTel(req.getParameter("tel")); 
		dto.setEmail(req.getParameter("email"));
		
		
		
		DataRoomDAO dao = new DataRoomDAO(req.getServletContext());
		
		int rs = dao.insert(dto);
		dao.close();
		/*
		if(rs == 1) {
			req.setAttribute("MEM", "회원가입이 되었습니다.");
			req.getRequestDispatcher("/DataRoom/MemFianl.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("MEM", "회원가입에 실패하였습니다.");
			req.getRequestDispatcher("/DataRoom/MemFianl.jsp").forward(req, resp);
		}
		*/
		req.setAttribute("MEM", rs);
		req.getRequestDispatcher("/DataRoom/MemFianl.jsp").forward(req, resp);
		
		
		
	}
	 
}
