package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;

public class DeleteMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int idx = (int)session.getAttribute("idx");
		MemberDao dao = new MemberDao();
		try {
			dao.deleteMemberDao(idx);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("Controller?command=MainPage");
		session.invalidate();
	}
}
