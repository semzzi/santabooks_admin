<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<script src="https://cdn.ckeditor.com/4.13.1/standard/ckeditor.js"></script>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js" charset="utf-8"></script>
<script type="text/javascript">
$(document).ready(function(){

$("#btnEpisodeUpdate").click(function() {
	$("#updateForm").submit();
	
});
	

});

</script>  

<style type="text/css">

a:link {text-decoration: none; color: #858796;}
a:visited {text-decoration: none; color: #858796;}
a:active {text-decoration: none; color: #858796;}
a:hover {text-decoration: underline; color: #858796;}


th{
	background-color: #fff;
	
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

#content-wrapper {
	min-height: 1100px;
}

#btnUpdate {
	float: right;
}

textarea {
	width: 900px;
	height: 500px;
	resize: none;
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
                  <h6 class="m-0 font-weight-bold text-primary">${episode.title} 수정</h6>
                
                </div>
                <!-- Card Body -->
                <div class="card-body">
        <form id="updateForm" action="/admin/board/novel_episode_update?episodeNo=${episode.episodeNo }" method="post">
			<table class="table">
		<tr>
			<th scope="row" style="width: 10%;">제목</th>
			<td><input type="text" name="title" id="title" value="${episode.title }"/></td>
		</tr>
		<tr>
			<th scope="row" style="width: 15%;">작성자</th>
			<td>${episode.memberName }</td>
		</tr>
		<tr>
			<th scope="row" style="width: 15%;">작성일</th>
			<td>${episode.addDate }</td>
		</tr>
		<tr> 
			<th style="width: 15%;">평점</th>
			<td>${episode.score }</td>
		</tr>
		<tr>
			<th scope="row" >내용</th>				
			<td colspan="6"><textarea name="content" id="epContent">${episode.content }</textarea>
			<script>
                       CKEDITOR.replace( 'epContent' );
               	</script>
               	</td>
		</tr>
			</table>
			<input hidden="" value="${episode.episodeNo }" name="episodeNo"/>
		</form>
                </div>
              </div>
           <a href="/admin/board/novel_episode?novelNo=${episode.novelNo }"><button class="btn btn-md btn-primary b-btn" id="btnlist">목록</button></a>           
           <button class="btn btn-md btn-primary b-btn" id="btnUpdate" data-toggle="modal" data-target="#episodeUpdate">수정</button>           
            </div>

        </div>
        <!-- /.container-fluid -->
<!-- 		<a href="/board/write"><button id="btnWrite" style="float: right;">작성</button></a> -->

	</div>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />   
  

