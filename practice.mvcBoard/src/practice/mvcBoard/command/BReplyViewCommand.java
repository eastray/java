package practice.mvcBoard.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.mvcBoard.dao.BDao;
import practice.mveBoard.dto.BDto;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String bId = request.getParameter("bId");
		System.out.println("bId: " +bId);
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bId);

		request.setAttribute("reply_view", dto);

	}

}
