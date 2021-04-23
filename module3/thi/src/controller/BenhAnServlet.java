package controller;

import exception.*;
import model.BenhAn;
import serivice.benh_an.BanhAnService;
import serivice.benh_nhan.BenhNhanService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BenhAnServlet",urlPatterns = "/benhan")
public class BenhAnServlet extends HttpServlet {
    BanhAnService banhAnService = new BanhAnService();
    BenhNhanService benhNhanService = new BenhNhanService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
//                createCustomer(request, response);
//                getAllCustomer(request, response);
//                break;
            case "update":
                updateCustomer(request, response);
                getAllCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                getAllCustomer(request, response);
                break;
            default:
                break;
        }
    }


//    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
//        boolean flag = true;
//        String messageId = null;
//        String messageBirthday = null;
//        String messageIdCard = null;
//        String messagePhone = null;
//        String messageEmail = null;
//
//        String id = null;
//        try {
//            id = request.getParameter("id");
//            Validate.regexCustomerId(id);
//        } catch (IdException e) {
//            messageId = e.getMessage();
//            flag = false;
//        }
//        String name = request.getParameter("name");
//        System.out.println(name);
//        String birthday = null;
//        try {
//            birthday = request.getParameter("birthday");
//            Validate.regexDate(birthday);
//        } catch (DateException e) {
//            messageBirthday = e.getMessage();
//            flag = false;
//        }
//        String gender = request.getParameter("gender");
//        String idCard = null;
//        try {
//            idCard = request.getParameter("idCard");
//            Validate.regexIdCard(idCard);
//        } catch (IdCardException e) {
//            messageIdCard = e.getMessage();
//            flag = false;
//        }
//        String phoneNumber = null;
//        try {
//            phoneNumber = request.getParameter("phone");
//            Validate.regexPhone(phoneNumber);
//        } catch (NumberPhoneException e) {
//            messagePhone = e.getMessage();
//            flag = false;
//        }
//        String email = null;
//        try {
//            email = request.getParameter("email");
//            Validate.regexEmail(email);
//        } catch (EmailException e) {
//            messageEmail = e.getMessage();
//            flag = false;
//        }
//        String address = request.getParameter("address");
//        String customerType = request.getParameter("customerType");
//
//        if (!flag) {
//            request.setAttribute("messageId", messageId);
//            request.setAttribute("messageBirthday", messageBirthday);
//            request.setAttribute("messageIdCard", messageIdCard);
//            request.setAttribute("messagePhone", messagePhone);
//            request.setAttribute("messageEmail", messageEmail);
//
//            createJSP(request, response);
//
//        } else {
//
//            Customer customer = new Customer(id, name, birthday, idCard, phoneNumber, email, address, gender, customerType);
//            customerService.insertCustomer(customer);
//
//        }
//    }
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id1 = request.getParameter("id_benh_an");
        String id2= request.getParameter("id_benh_nhan");
        String ngay_nhap_vien = request.getParameter("ngay_nhap_vien");
        String ngay_ra_vien = request.getParameter("ngay_ra_vien");
        String bac_si_dieu_tri = request.getParameter("bac_si_dieu_tri");
        String ly_do = request.getParameter("ly_do");
        BenhAn benhAn = new BenhAn(id1, id2, ngay_nhap_vien, ngay_ra_vien, bac_si_dieu_tri, ly_do);

        banhAnService.updateBenhAn(benhAn);
    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id_benh_an");
        banhAnService.deleteBenhAn(id);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                createJSP(request, response);
                break;
            case "find":
//                findJSP(request, response);
                break;
            default:
                getAllCustomer(request, response);
        }
    }

    private void getAllCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<BenhAn> benhAnList = banhAnService.selectAllBenhAn();
        request.setAttribute("benhAnList", benhAnList);
        request.setAttribute("benhNhanList", benhNhanService.selectAllBenhNhan());

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

//    private void findJSP(HttpServletRequest request, HttpServletResponse response) {
//        String name = request.getParameter("name");
//        List<Customer> customerList = customerService.selectCustomerByName(name);
//        request.setAttribute("customerList", customerList);
//
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list_find.jsp");
//
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException | IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void createJSP(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("benhNhanList", benhNhanService.selectAllBenhNhan());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

}
