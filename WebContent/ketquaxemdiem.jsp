<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.sqa.util.DBConnection" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "com.sqa.model.MonHoc" %>
<!DOCTYPE html>
<html>
<head>
	<title>Kết quả xem điểm</title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<img src="img1.png" alt="back-ground pic" width="1100px" height="200px" class="mx-auto d-block ">
		<div class="na">			
		</div>

		<div>
			<nav class="navbar navbar-expand-sm bg-light justify-content-center">
				<ul class="navbar-nav">
					<li class="nav-item">
						<a href="#" class="nav-link">Trang chủ</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link">Đăng kí môn học</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link">Xem TKB</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link">Xem lịch thi</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link">Xem lịch thi lại</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link">Xem điểm</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link">Sửa thông tin</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link">Xem học phí</a>
					</li>
				</ul>
			</nav>
		</div>
		<br>
		<br>
		<h2>Xem điểm</h2>
		<%!String maSv;%>
		<%!String kiHoc; %>
		<%!String sinhVienId; %>
		<%!String kihocId; %>
		<%!int tongTinChi; %>
		<%!float tongDiem; %>
		<form action="" method="get" class="bg-light">
			<label for="masv">Mã sinh viên</label>
			<input type="text" id="masv" name="masv" value=${masv } onclick="inputValidation()">
			<label for="kihoc">Nhập kì học muốn xem điểm (năm học + kì học)</label>
			<input type="text" id="kihoc" name="kihoc" value=${kihoc }>
			<input type="button" value="Xem điểm" >
		</form>
		<p id="p1"></p>
		<br>
		<br>
		<h3>Thông tin sinh viên</h3>
		<ul class="list-group ">
				<li class="list-group-item "><b>Mã sinh viên</b>: ${masv} </li>
				<li class="list-group-item "><b>Tên sinh viên</b>:  ${hoten } </li>
				<li class="list-group-item "><b>Lớp chuyên ngành</b>: ${lop } </li>
				<li class="list-group-item "><b>Ngành</b>:  ${nganh }</li>
				<li class="list-group-item "><b>Khóa học</b> : ${khoahoc }</li>
					
			
		</ul>
		<br>
		<br>
		<h3>Kết quả</h3>
		<table class="table table-bordered ">
			<thead class="bg-primary">
				<tr>
					<th>Mã môn</th>
					<th>Tên môn</th>
					<th>Tín chỉ</th>
					<th>Điểm CC</th>
					<th>Điểm TH</th>
					<th>Điểm KT</th>
					<th>Điểm BT</th>
					<th>Điểm thi L1</th>
					<th>Điểm thi L2</th>
					<th>% Chuyên cần</th>
					<th>% Kiểm tra</th>
					<th>% Thực hành</th>
					<th>% Bài tập</th>
					<th>% Thi</th>
					<th>Điểm TB</th>
					<th>KQ</th>

				</tr>
			</thead>
			<tbody class="bg-light">
				<% 
				ArrayList<MonHoc> list = (ArrayList)request.getAttribute("monhoclist");
				for(int i=0;i< list.size();i++){
					MonHoc m = (MonHoc)list.get(i);
				%>
					<tr>
						<td><%=m.getMaMonHoc() %></td>
						<td><%=m.getTenMonHoc() %></td>
						<td><%=m.getSoTinChi() %></td>
						<td><%=m.getDiemCC() %></td>
						<td><%=m.getDiemKt() %></td>
						<td><%=m.getDiemTh() %></td>
						<td><%=m.getDiemTB() %></td>
						<td><%=m.getDiemThi() %></td>
						<td><%=m.getDiemThiL2() %></td>
						<td><%=m.getPtCC() %></td>
						<td><%=m.getPtKT() %></td>
						<td><%=m.getPtTH() %></td>
						<td><%=m.getPtBT() %></td>
						<td><%=m.getPtThi() %></td>
						<td><%=m.getDiemTB()%></td>
						<td><%=m.getKq()%></td>		
					</tr>
				<%
				}
				%>	
			</tbody>
		</table>
		<p><b>Điểm trung bình của học kì này: ${diemtb } </b></p>
		
	</div>

</body>
</html>