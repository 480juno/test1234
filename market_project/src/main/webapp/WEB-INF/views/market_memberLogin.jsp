<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="login_wrap">
  <h2 class="login_title">로그인</h2>
  <form method="post" action="market_login_ok.do">
   <table id="login_t">
    <tr>
     <th>아이디</th>
     <td>
      <input name="id" id="id" size="20" class="input_box" />
     </td>
    </tr>
    
    <tr>
     <th>비밀번호</th>
     <td>
     <input type="password" name="pwd" id="pwd" size="20" class="input_box"/>
     </td>
    </tr>
   </table>
    <div id="login_menu">
    <input type="submit" value="로그인" class="input_button" onclick="location='market_login_tomain.do'"/>
    <input type="reset" value="취소" class="input_button"
    		onclick="$('#id').focus();" />
    <input type="button" value="회원가입" class="input_button"
    		onclick="location='member_join.do'" />
    <input type="button" value="비번찾기" class="input_button"
    		onclick="pwd_find()" />
    </div>
 

</body>
</html>