package com.sqa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sqa.model.KiHoc;
import com.sqa.model.MonHoc;

/**
 * Servlet implementation class XemDiemServlet
 */
@WebServlet("/XemDiemServlet")
public class XemDiemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XemDiemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String masv = request.getParameter("masv");
		String kihoc = request.getParameter("kihoc");
		request.getParameter("kihoc");
		String kihocId="";
		String svId="";
		String hoTen = "";
		String lop = "";
		String khoahoc = "";
		String nganh="";
		int tongTc = 0;
		float tongDiemTb = 0;
		float diemTb = 0;
		ArrayList<MonHoc> list = new ArrayList<>();
		try {
			kihocId = KiHocDAO.getId(kihoc);
			hoTen = SinhVienDAO.getHoTen(masv);
			lop = SinhVienDAO.getLopChuyenNganh(masv);
			khoahoc = SinhVienDAO.getKhoaHoc(masv);
			nganh = SinhVienDAO.getNganh(masv);
			svId = SinhVienDAO.getId(masv);
			list = MonHocDAO.cacMonHoc(svId, kihocId);
			tongTc = MonHocDAO.tonTinChi(svId, kihocId);
			tongDiemTb = MonHocDAO.tongDiemTB(svId, kihocId);
			diemTb = MonHocDAO.diemTB(tongTc, tongDiemTb);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//PrintWriter pr = response.getWriter();
		//pr.println(tongTc);
		//pr.println(tongDiemTb);
		//pr.println(diemTb);
		request.setAttribute("masv", masv);
		request.setAttribute("kihoc", kihoc);
		request.setAttribute("hoten", hoTen);
		request.setAttribute("lop", lop);
		request.setAttribute("khoahoc", khoahoc);
		request.setAttribute("nganh", nganh);
		request.setAttribute("monhoclist", list);
		request.setAttribute("diemtb", diemTb);
		RequestDispatcher dis = request.getRequestDispatcher("ketquaxemdiem.jsp");
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("ketquaxemdiem.jsp");
	}

}
