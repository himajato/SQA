<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Sinh viên xem điểm</title>
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
					<li class="nav-item" class="disabled">
						<a href="#" class="nav-link">Trang chủ</a>
					</li>
					<li class="nav-item" class="disabled">
						<a href="#" class="nav-link">Đăng kí môn học</a>
					</li>
					<li class="nav-item" class="disabled">
						<a href="#" class="nav-link">Xem TKB</a>
					</li>
					<li class="nav-item" class="disabled">
						<a href="#" class="nav-link">Xem lịch thi</a>
					</li>
					<li class="nav-item" class="disabled" >
						<a href="#" class="nav-link">Xem lịch thi lại</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link">Xem điểm</a>
					</li>
					<li class="nav-item" class="disabled">
						<a href="#" class="nav-link">Sửa thông tin</a>
					</li>
					<li class="nav-item" class="disabled">
						<a href="#" class="nav-link">Xem học phí</a>
					</li>
				</ul>
			</nav>
		</div>
		<br>
		<br>
		<h2>Xem điểm </h2>
		<form method="get" action="XemDiemServlet" class="bg-light" id="form" onsubmit="return validation()" name="form">
			<label for="masv">Mã sinh viên</label>
			<input type="text" id="masv" name="masv" placeholder="Nhập mã sinh viên" required="required">
			<label for="kihoc">Nhập kì học muốn xem điểm (năm học + kì học)</label>
			<input type="number" id="kihoc" name="kihoc" placeholder="VD: 20192" required="required">
			<input type="submit" id="bt" value="Xem điểm">
		</form>
		
		<script>
			function validation() {
				if(document.form.masv.value.length >10 || document.form.masv.value.length <10){
					alert("Mã Sinh Viên gồm 10 kí tự VD: B17DCCN462")
					document.form.masv.focus();
					return false;					
				}else if (document.form.masv.value !="B17DCCN462" && document.form.masv.value !="B17DCCN729" && document.form.masv.value !="B17DCCN471" && document.form.masv.value !="B17DCCN481"){
					alert("Không tìm thấy sinh viên")
					document.form.masv.focus();
					return false;
				}else if (document.form.kihoc.value.length >5 ||document.form.kihoc.value.length <5 ){
					alert("Kì học gồm 5 kí tự VD: 20192")
					document.form.kihoc.focus();
					return false;
				}else if (document.form.kihoc.value !="20182" && document.form.kihoc.value !="20192"){
					alert("Không tìm thấy kì học")
					document.form.kihoc.focus();
					return false;
				}
			}
		</script>
		<br>
	</div>

</body>
</html>