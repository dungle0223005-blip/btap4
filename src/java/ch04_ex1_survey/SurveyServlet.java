package ch04_ex1_survey;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SurveyServlet", urlPatterns = {"/survey"})
public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Đảm bảo xử lý tiếng Việt đúng
        request.setCharacterEncoding("UTF-8");

        // Lấy dữ liệu từ form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");
        String heardFrom = request.getParameter("heardFrom");
        String wantsUpdates = request.getParameter("wantsUpdates");
        String emailOK = request.getParameter("emailOK");
        String contactVia = request.getParameter("contactVia");
        String emailUpdates = request.getParameter("emailUpdates");

        // Xử lý checkbox nếu không được chọn
        if (wantsUpdates == null) wantsUpdates = "No";
        if (emailOK == null) emailOK = "No";

        // Gửi dữ liệu sang JSP
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("email", email);
        request.setAttribute("dob", dob);
        request.setAttribute("heardFrom", heardFrom);
        request.setAttribute("wantsUpdates", wantsUpdates);
        request.setAttribute("emailOK", emailOK);
        request.setAttribute("contactVia", contactVia);
        request.setAttribute("emailUpdates", emailUpdates);

        // Chuyển tiếp sang trang cảm ơn
        RequestDispatcher dispatcher = request.getRequestDispatcher("thanks.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
