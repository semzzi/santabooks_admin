<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!-- 검색조건 쿼리스트링 가져오기 -->
<%-- <c:set var="query" value="&searchType=${paging.searchType}&keyword=${paging.keyword }"/> --%>



<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js" charset="utf-8"></script>
<script type="text/javascript">


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
		<c:forEach items="${shipment }" var="ship">
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between" style="height: 70px;">
                  <h6 class="m-0 font-weight-bold text-primary">${ship.shipmentDate }배송 정보 조회</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
        <form action="/admin/shipment/list" method="post">
				<table class="table">
				
		<tr>
			<th scope="row" style="width: 10%;">배송번호</th>
			<td>${ship.shipNo }</td> 
		</tr>
		<tr>	
			<th scope="row" style="width: 10%;">배송날짜</th>
			<td>${ship.shipmentDate  }</td>
		</tr>
		<tr>
			<th scope="row" style="width: 15%;">이름</th>
			<td>${ship.memberName }</td>
		</tr>
		<tr> 
			<th style="width: 15%;">책 이름</th>
			<td>${ship.bookName }</td>
		</tr>
		<tr>
			<th style="width: 15%;">구독번호</th>				
			<td>${ship.subNo }</td>
		</tr>
		<tr>
			<th style="width: 15%;">결제</th>				
			<td>${ship.subPay }</td>
		</tr>
			</table>
		</form>
                </div>
			</c:forEach>
              </div>
            </div>

        </div>
        <!-- /.container-fluid -->
           <a href="/admin/shipment/list"><button class="btn btn-md btn-primary b-btn" id="btnlist">목록</button></a>           
 
	</div>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />   
  

