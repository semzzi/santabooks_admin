<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!-- 검색조건 쿼리스트링 가져오기 -->
<c:set var="query" value="&searchType=${paging.searchType}&keyword=${paging.keyword }"/>



<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js" charset="utf-8"></script>
<script type="text/javascript">
$(document).ready(function(){

$("#checkbtn").click(function(){
	if($("input[type=checkbox]").is(":checked")){
	$('#novelDeleteModal').modal('show');	
	} else{
	$('#novelNotDeleteModal').modal('show');
	}
})
	$("#btnNovelDelete").click(function() {
		$("#checkDelete").submit();	
	})
	
});


/* 체크박스 전체선택, 전체해제 */
$(function(){ //전체선택 체크박스 클릭 
	$("#checkAll").click(function(){ //만약 전체 선택 체크박스가 체크된상태일경우 
		if($("#checkAll").prop("checked")) { //해당화면에 전체 checkbox들을 체크해준다 
			$("input[type=checkbox]").prop("checked",true); // 전체선택 체크박스가 해제된 경우 
		} else { //해당화면에 모든 checkbox들의 체크를해제시킨다.
			$("input[type=checkbox]").prop("checked",false); } }) })


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

#checkbtn {
	position: relative;
    bottom: 10px;
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
                  <h6 class="m-0 font-weight-bold text-primary">웹소설 목록</h6>
                   <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search" action="/admin/board/novel" method="get">
                    <select name="searchType">                                   
                    	<option value="title">제목</option>
                    	<option value="memberName" selected="selected">작성자</option> 
                    </select>
                    <div class="input-group">
              <input style="bottom: 8px;"type="text" id="keyword" name="keyword" class="form-control bg-light border-0 small" placeholder="검색어를 입력해주세요" aria-label="Search" aria-describedby="basic-addon2">
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
        <form action="/admin/board/novel" method="post" id="checkDelete">
			<table class="table table-hover">
		<tr>	
		   	<th style="width: 1%"><input type="checkbox" class="chk" id="checkAll" name="checkAll">	
			<th style="width: 5%;">번호</th>
			<th style="width: 7%;">제목</th>
			<th style="width: 7%;">작성자</th>
			<th style="width: 5%;">평점</th>
			<th style="width: 10%;">작성일</th>		
			<th style="width: 10%;">구분</th>	
		</tr>
			<c:forEach items="${list }" var="novel">
		<tr>
			<td>
      		<label style="height: 1px;"><input type="checkbox" class="chk" id="checkRow"
             name="checkRow" value="${novel.novelNo }"></label></td>
			<td>${novel.novelNo }</td> 
			<td><a href="./novel_episode?novelNo=${novel.novelNo }">${novel.title }</a></td>   
			<td>${novel.memberName }</td> 
			<td>${novel.score }</td> 
			<td>${novel.addDate }</td> 
			<td>${novel.category }</td>
		</tr>
			<input hidden="" value="${novel.novelNo}" name="novelNo"/>
			</c:forEach>
			</table>
		</form>
       </div>
      </div>
		<button class="btn btn-md btn-danger b-btn" id="checkbtn"  style="float: left;">체크삭제</button>
<!-- 		data-toggle="modal" data-target="#novelDeleteModal" -->
     </div>
    </div>
        <!-- /.container-fluid -->
<!-- 		<a href="/board/write"><button id="btnWrite" style="float: right;">작성</button></a> -->

	<jsp:include page="/WEB-INF/views/layout/paging_novel.jsp" />   
	</div>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />   
  

