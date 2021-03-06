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
            <div class="col-xl-12 col-lg-7" id="list">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between" style="height: 70px;">
                  <h6 class="m-0 font-weight-bold text-primary">회원 목록</h6>
<!--                    <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search" action="/admin/member/list" method="get"> -->
<!--                     <select name="searchType"> -->
<!--                     	<option value="memberId">이메일</option>  -->
<!--                     	<option value="memberName">이름</option>  -->
<!--                     	<option value="memberNick">닉네임</option>  -->
<!--                     	<option value="memberBirth">생년월일</option>  -->
<!--                     </select> -->
<!--                     <div class="input-group"> -->
<!--               <input style="bottom: 8px;"type="text" id="keyword" name="keyword" class="form-control bg-light border-0 small" placeholder="검색어를 입력해주세요" aria-label="Search" aria-describedby="basic-addon2"> -->
<!--               <div class="input-group-append"> -->
<!--                 <button class="btn btn-primary" style="bottom: 8px;"> -->
<!--                   <i class="fas fa-search fa-sm"></i> -->
<!--                 </button> -->
<!--               </div> -->
<!--             </div> -->
<!--             </form> -->
                </div>
                <!-- Card Body -->
                <div class="card-body">
        <form action="/admin/shipment/list" method="post">
			<table class="table table-hover">
		<tr>	
			<th style="width: 10%;">구독번호</th>
			<th style="width: 10%;">회원번호</th>			
			<th style="width: 30%;">이메일</th>
			<th style="width: 20%;">이름</th>
			<th style="width: 30%;">배송</th>
		</tr>
			<c:forEach items="${list }" var="s">
		<tr>
			<td>${s.subNo }</td> 
			<td>${s.memberNo }</td> 
			<td>${s.memberId }</td>   
			<td>${s.memberName }</td> 
			<td class="btnTd" data-memberno='${s.memberNo }'>
			<c:if test="${s.checkShipment eq 0 }">
			<button class="btn btn-md btn-primary b-btn shipmentBtn" name = "memberNo" value="${s.memberNo }" id="btnShipment">배송</button>
			</c:if>
			<c:if test="${s.checkShipment eq 1 }">
			<button class="btn btn-md btn-primary b-btn shipmentBtn" disabled="disabled" id="btnShipment">배송</button>
			<a href="/admin/shipment/checkpage?memberNo=${s.memberNo }"><button class="btn btn-md btn-primary b-btn shipmentBtn" type="button">조회</button></a>
			</c:if>
			</td> 
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

	<jsp:include page="/WEB-INF/views/layout/paging_submember.jsp" />   
	</div>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />   
  

