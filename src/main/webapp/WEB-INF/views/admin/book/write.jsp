<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!-- 검색조건 쿼리스트링 가져오기 -->
<c:set var="query" value="&searchType=${paging.searchType}&keyword=${paging.keyword }"/>



<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js" charset="utf-8"></script>
<script type="text/javascript">
$(document).ready(function(){

$("#btnWrite").click(function() {
	$(form).submit();
});
	

});

</script>  

<style type="text/css">

a:link {text-decoration: none; color: #858796;}
a:visited {text-decoration: none; color: #858796;}
a:active {text-decoration: none; color: #858796;}
a:hover {text-decoration: underline; color: #858796;}


th{
	background-color: #e4e4e4;
	
}

th, td{
	
	text-align: center;
}

tr td:not(:first-child), tr th:not(:first-child) {
	border-left: 0.4px solid lightgray;
}

tr td:nth-child(2) {
	text-align: left;
}


table {
	width: 700px;
}

.bg-light {
    background-color: #ededed!important;
}

.mr-auto, .mx-auto {
    margin-right: 0 auto!important;
}

select {
	position: relative;
    right: 91px;
    top: 29px;
    height: 36px;
    border-radius: 3px;
    background: #ededed;
    border: none;
}

</style>

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <div class="row">

            <!-- Area Chart -->
            <div class="col-xl-12 col-lg-7" id="list" style="height: 750px;">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between" style="height: 70px;">
                  <h6 class="m-0 font-weight-bold text-primary">도서 리스트</h6>
                   <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search" action="/admin/member/list" method="get">
                    <select name="searchType">
                    	<option value="bookName">제목</option> 
                    	<option value="genreName">장르</option> 
                    	<option value="bookWriter">저자</option> 
                    	<option value="bookPublisher">출판사</option> 
                    	<option value="bookContent">내용</option> 
                    </select>
                    <div class="input-group">
              <input style="bottom: 8px;"type="text" id="keyword" name="keyword" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" style="bottom: 8px;">
                  <i class="fas fa-search fa-sm"></i>
                </button>
              </div>
            </div>
            </form>
                </div>
                <!-- Card Body -->
                <div class="card-body">
        <form action="/admin/book/view" method="get">
			<table class="table table-hover">
		<tr>	
			<th style="width: 15%;">장르</th>
			<th style="width: 45%;">제목</th>
			<th style="width: 15%;">저자</th>		
			<th style="width: 15%;">출판사</th>					
		</tr>
			<c:forEach items="${list }" var="book">
		<tr>
			<td><input type="text" name="genreNo" placeholder="1~10까지 "/></td> 
			<td>${book.genreName }</td> 
			<td><a href="./view?bookNo=${book.bookNo }">${book.bookName }</a></td>   
			<td>${book.bookWriter }</td> 
			<td>${book.bookPublisher }</td>
<%-- 			<td>${member.memberTel }</td> --%>
<%-- 			<td>${member.memberAdd }</td> --%>
<%-- 			<td>${member.memberGender }</td> --%>
<%-- 			<td>${member.genre }</td> --%>
<%-- 			<td>${member.subcheck }</td> --%>
		</tr>
			</c:forEach>
			</table>
		</form>
                </div>
              </div>
            </div>

        </div>
        <!-- /.container-fluid -->
<!-- 		<a href="/board/write"><button id="btnWrite" style="float: right;">작성</button></a> -->

	<jsp:include page="/WEB-INF/views/layout/paging_book.jsp" />   
	</div>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />   
  

