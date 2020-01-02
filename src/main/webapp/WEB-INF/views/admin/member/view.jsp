<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js" charset="utf-8"></script>
<script type="text/javascript">
$(document).ready(function(){

$("#btnWrite").click(function() {
	$(form).submit();
});
	

});

</script>  

<style type="text/css">
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

button {
	float: right;
}

</style>

        <!-- Begin Page Content -->
        <div class="container-fluid">
          <div class="row">
            <!-- Area Chart -->
            <div class="col-xl-12 col-lg-7" id="list">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">[${member.memberName}]님의 상세 정보</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                    <form action="/admin/member/memberdelete" method="get">
			<table class="table table-hover">
		<tr>	
			<th style="width: 5%;">번호</th>
			<th style="width: 7%;">이메일</th>
			<th style="width: 5%;">이름</th>
			<th style="width: 10%;">닉네임</th>		
			<th style="width: 10%;">생년월일</th>		
			<th style="width: 15%;">전화번호</th>		
			<th style="width: 15%;">주소</th>		
			<th style="width: 10%;">성별</th>		
			<th style="width: 13%;">관심장르</th>		
			<th style="width: 10%;">구독여부</th>		
		</tr>
		<tr>
		
			<td>${member.memberNo }</td> 
			<td>${member.memberId }</td>   
			<td>${member.memberName }</td> 
			<td>${member.memberNick }</td> 
			<td>${member.memberBirth }</td>
			<td>${member.memberTel }</td>
			<td>${member.postcode }&nbsp;${member.roadaddress }${member.jibunaddress }${member.detailaddress }</td>
			<td>${member.memberGender }</td>
			<td>${member.genre }</td>
			<td>${member.subcheck }</td>
		
		</tr>
			</table>
	<!-- <button>체크삭제</button> -->
		</form>
		</div>
		</div>
		</div>
		
            <!-- Area Chart -->
            <div class="col-xl-12 col-lg-7" id="list">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">[${member.memberName}]님이 작성한 웹소설</h6>
                  
                </div>
                <!-- Card Body -->
                <div class="card-body">
                    <form action="/admin/member/noveldelete" method="get">
			<table class="table table-hover">
			<c:choose>
			<c:when test="${not empty novelList}">
		<tr>	
			<th style="width: 5%;">번호</th>
			<th style="width: 7%;">제목</th>
			<th style="width: 5%;">평점</th>
			<th style="width: 10%;">작성일</th>		
			<th style="width: 10%;">구분</th>				
		</tr>
			<c:forEach items="${novelList }" var="novel">
		<tr>
			<td>${novel.novelNo }</td> 
			<td>${novel.title }</td>   
			<td>${novel.score }</td> 
			<td>${novel.addDate }</td> 
			<td>${novel.category }</td>
		</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>			
			<th>작성된 웹 소설이 없습니다.</th>
			</c:otherwise>
			</c:choose>
			</table>
	<!-- <button>체크삭제</button> -->
		</form>
		</div>
		</div>
		</div>
		<div class="col-xl-12 col-lg-7" id="list">
              <div class="card shadow mb-4">
             
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">[${member.memberName}]님이 작성한 리뷰</h6>
                  
                </div>
            
                <div class="card-body">
        <form action="/admin/member/reviewdelete" method="get">
			<table class="table table-hover">
			<c:choose>
			<c:when test="${not empty reviewList}">
		<tr>	
			<th style="width: 5%;">번호</th>
			<th style="width: 7%;">책 제목</th>
			<th style="width: 5%;">리뷰</th>
			<th style="width: 10%;">공개여부</th>		
			<th style="width: 10%;">작성일</th>		
		</tr>
			<c:forEach items="${reviewList }" var="review">
		<tr>
			<td>${review.feedNo }</td> 
			<td>${review.bookName }</td>   
			<td>${review.review }</td> 
			<c:if test="${review.privacy eq 0 }">
			<td>공개</td> 
			</c:if>
			<c:if test="${review.privacy ne 0 }">
			<td>비공개</td>  
			</c:if>
			<td>${review.reviewDate }</td>
		</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>			
			<th>작성된 리뷰가 없습니다.</th>
			</c:otherwise>
			</c:choose>
			</table>
	<!-- <button>체크삭제</button> --> 	
	</form>
                </div>
              </div>
            </div>
		<div class="col-xl-12 col-lg-7" id="list">
              <div class="card shadow mb-4">
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">[${member.memberName}]님이 작성한 댓글</h6>
                </div>
                <div class="card-body">
        <form action="/admin/member/commentdelete" method="get">
			<table class="table table-hover">
			<c:choose>
			<c:when test="${not empty reviewList}">
		<tr>	
			<th style="width: 5%;">번호</th>
			<th style="width: 7%;">내용</th>
			<th style="width: 5%;">작성일</th>		
		</tr>
			<c:forEach items="${commentList }" var="comment">
		<tr>
			<td>${comment.commentNo }</td> 
			<td>${comment.content }</td> 
			<td>${comment.addDate }</td>
		</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>			
			<th>작성한 댓글이 없습니다.</th>
			</c:otherwise>
			</c:choose>
			</table>
	<!-- <button>체크삭제</button> --> 	
	</form>
                </div>
              </div>
              <form action="/admin/member/view?memberNo=${member.memberNo }" method="post">              
              		<a><button class="btn btn-md btn-primary" id="withDrawal">탈퇴</button></a>
              </form>
            </div>

        <!-- /.container-fluid -->
<!-- 		<a href="/board/write"><button id="btnWrite" style="float: right;">작성</button></a> -->   
   
	</div>
</div>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />   
  

