package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HorseImpl;
import vo.HorseInfoVO;

@WebServlet("/horse_list")
public class HorseProfile_list_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HorseImpl hi = new HorseImpl();
		ArrayList<HorseInfoVO> hlist = hi.horseSelect();
		RequestDispatcher rd = request.getRequestDispatcher("hr_list.jsp");
		request.setAttribute("hlist", hlist);
		rd.forward(request, response);
	}

}
