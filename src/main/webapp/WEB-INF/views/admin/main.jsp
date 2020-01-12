<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <div class="container-fluid">   
  <!-- Page Heading -->

          <!-- Content Row -->
          <div class="row">

           
          <!-- Content Row -->

          <div class="row">

            <!-- 멤버! Chart -->
            <div class="col-xl-6 col-lg-5">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">회원 overview</h6>
                  <div class="dropdown no-arrow">
                    <a class="dropdown-toggle" href="/admin/member/list" role="button">
                      <i class="fas fa-plus" style="color: green;"></i>
                    </a>
                 
                  </div>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  <div class="chart-area">
                       <table class="table">
						<tr>	
							<th style="width: 15%;">번호</th>
							<th style="width: 20%;">이메일</th>
							<th style="width: 15%;">이름</th>
							<th style="width: 20%;">닉네임</th>		
							<th style="width: 30%;">생년월일</th>	
						</tr>
							<c:forEach items="${memberList }" var="member">
						<tr>
							<td>${member.memberNo }</td> 
							<td>${member.memberId }</td>   
							<td>${member.memberName }</td> 
							<td>${member.memberNick }</td> 
							<td>${member.memberBirth }</td>
						</tr>
					</c:forEach>
					</table>
                  </div>
                </div>
              </div>
            </div>
            
              <!-- 웹소설! Chart -->
            <div class="col-xl-6 col-lg-5">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">웹소설 overview</h6>
                  <div class="dropdown no-arrow">
                    <a class="dropdown-toggle" href="/admin/board/novel" role="button">
                      <i class="fas fa-plus" style="color: green;"></i>
                    </a>
                 
                  </div>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  <div class="chart-area">
                       <table class="table">
						<tr>	
							<th style="width: 10%;">번호</th>
							<th style="width: 30%;">제목</th>
							<th style="width: 20%;">작성자</th>
							<th style="width: 15%;">평점</th>		
<!-- 							<th style="width: 15%;">작성일</th>	 -->
						</tr>
							<c:forEach items="${novelList }" var="novel">
						<tr>
							<td>${novel.novelNo }</td> 
							<td>${novel.title }</td>   
							<td>${novel.memberName }</td> 
							<td>${novel.score }</td> 
<%-- 							<td>${novel.addDate }</td> --%>
						</tr>
					</c:forEach>
					</table>
                  </div>
                </div>
              </div>
            </div>
            
              <!-- 리뷰! Chart -->
            <div class="col-xl-12 col-lg-11">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">리뷰 overview</h6>
                  <div class="dropdown no-arrow">
                    <a class="dropdown-toggle" href="/admin/board/review" role="button">
                      <i class="fas fa-plus" style="color: green;"></i>
                    </a>
                 
                  </div>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  <div class="chart-area">
                       <table class="table">
						<tr>	
							<th style="width: 10%;">번호</th>
							<th style="width: 30%;">책 이름</th>
							<th style="width: 40%;">내용</th>
							<th style="width: 20%;">작성자</th>		
						</tr>
							<c:forEach items="${reviewList }" var="review">
						<tr>
							<td>${review.feedNo }</td> 
							<td>${review.bookName }</td>   
							<td>${review.review }</td> 
							<td>${review.memberName }</td> 
						</tr>
					</c:forEach>
					</table>
                  </div>
                </div>
              </div>
            </div>
            
            <!-- 도서! Chart -->
            <div class="col-xl-7 col-lg-6">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">도서 overview</h6>
                  <div class="dropdown no-arrow">
                    <a class="dropdown-toggle" href="/admin/book/list" role="button">
                      <i class="fas fa-plus" style="color: green;"></i>
                    </a>
                 
                  </div>
                </div>
                <!-- Card Body -->
                <div class="card-body" style="height: 420px;">
                  <div class="chart-area">
                       <table class="table">
						<tr>	
							<th style="width: 10%;">번호</th>
							<th style="width: 15%;">장르</th>
							<th style="width: 40%;">제목</th>
							<th style="width: 20%;">저자</th>		
							<th style="width: 15%;">출판사</th>	
						</tr>
							<c:forEach items="${bookList }" var="book">
						<tr>
							<td>${book.bookNo }</td> 
							<td>${book.genreName }</td>   
							<td>${book.bookName }</td> 
							<td>${book.bookWriter }</td> 
							<td>${book.bookPublisher }</td>
						</tr>
					</c:forEach>
					</table>
                  </div>
                </div>
              </div>
            </div>

   			<!-- 댓글! Chart -->
            <div class="col-xl-5 col-lg-4">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">댓글 overview</h6>
                  <div class="dropdown no-arrow">
                    <a class="dropdown-toggle" href="/admin/board/comment" role="button">
                      <i class="fas fa-plus" style="color: green;"></i>
                    </a>
                 
                  </div>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  <div class="chart-area">
                       <table class="table">
						<tr>	
							<th style="width: 10%;">번호</th>
							<th style="width: 30%;">내용</th>
							<th style="width: 20%;">작성자</th>
<!-- 							<th style="width: 15%;">작성일</th>	 -->
						</tr>
							<c:forEach items="${commentList }" var="comment">
						<tr>
							<td>${comment.commentNo }</td> 
							<td>${comment.content }</td>   
							<td>${comment.memberName }</td> 
<%-- 							<td>${comment.addDate }</td> --%>
						</tr>
					</c:forEach>
					</table>
                  </div>
                </div>
              </div>
            </div>
            
          </div>

          <!-- Content Row -->
          <div class="row">

            <!-- Content Column -->
            <div class="col-lg-6 mb-4">

            </div>
          </div>

        
 
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />   
    