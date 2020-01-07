<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />       
<!-- <script src="https://cdn.jsdelivr.net/npm/pikaday/pikaday.js"></script> -->
<script src="https://cdn.ckeditor.com/4.13.1/standard/ckeditor.js"></script>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js" charset="utf-8"></script>
<script type="text/javascript">
$(document).ready(function(){

$("#btnUpdate").click(function() {
	$("#updateForm").submit();
});
	

});
</script>


<style type="text/css">

a:link {text-decoration: none; color: #858796;}
a:visited {text-decoration: none; color: #858796;}
a:active {text-decoration: none; color: #858796;}
a:hover {text-decoration: underline; color: #858796;}



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

input {
	width: 500px;
}

textarea {
	width: 900px;
	height: 500px;
	resize: none;
}

#content-wrapper {
	min-height: 1180px;
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
                  <h6 class="m-0 font-weight-bold text-primary">도서 정보 수정</h6>
                 
                </div>
                <!-- Card Body -->
                <div class="card-body">
         <form id = "updateForm" action="/admin/book/update" method="post">
			<table class="table">
		<tr>	
			<th scope="row" style="width: 10%;">제목</th>
			<td><input type="text" name="bookName" id="bookName" value="${book.bookName }"/></td>
		</tr>   
		<tr>
			<th scope="row" style="width: 15%;">저자</th>		
			<td><input type="text" name="bookWriter" id="bookWriter" value="${book.bookWriter }"/></td>
		</tr>
		<tr>
			<th scope="row" style="width: 15%;">장르</th>
			<td><select name="genreNo" >
			<option value="1">로맨스</option>
			<option value="2">판타지</option>
			<option value="3">자기계발</option>
			<option value="4">예술</option>
			<option value="5">컴퓨터/IT</option>
			<option value="6">시/에세이</option>
			<option value="7">경제/경영</option>
			<option value="8">만화</option>
			<option value="9">여행</option>
			<option value="10">건강</option>
			</select></td>
		</tr>
		<tr> 
			<th style="width: 15%;">출판사</th>
			<td><input type="text" name="bookPublisher" id="bookPublisher" value="${book.bookPublisher }"/></td>
		</tr>
		<tr>
			<th style="width: 15%;">출판일</th>				
			<td><input type="text" name="publishingYear" id="datepicker" placeholder="ex)1996-01-01"  value="${book.publishingYear }"/></td>
			
		</tr>
		<tr>
			<th scope="row" >내용</th>				
			<td colspan="6"><textarea name="bookContent" id="bookContent">${book.bookContent }</textarea>
				<script>
                       CKEDITOR.replace( 'bookContent' );
               	</script>
			</td>
		</tr>
			</table>
			<input hidden="" value="${book.bookNo}" name="bookNo"/>
		</form>
                </div>
              </div>
      <a href="/admin/book/list"><button class="btn btn-md btn-primary b-btn" id="btnlist">목록</button></a>        
      <button class="btn btn-md btn-primary b-btn" id="btnWrite0" style="float: right;" data-toggle="modal" data-target="#bookUpdate">수정</button>        
            </div>
        </div>
        <!-- /.container-fluid -->
   
	</div>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />   
  

