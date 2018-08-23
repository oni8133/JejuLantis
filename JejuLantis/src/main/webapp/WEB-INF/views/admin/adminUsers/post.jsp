<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%-- <%@ page import="java.util.*,com.test.mybatis.*"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>결과창</title>
<script type="text/javascript" charset="utf-8" src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.2/angular.min.js" ></script>

<script>
    //main페이지로 값 전달: 부모로 값전달하기 위해서는 opener사용
    function sendAdd(branch_name, branch_no){
        alert("부모로 값전달");
        opener.document.getElementById("branch_name").value = branch_name;
        opener.document.getElementById("branch_no").value= branch_no;
//         opener.document.getElementById("branch_tel").value=branch_tel;
//         opener.document.getElementById("branch_local").value=branch_local; 
        window.close(); 
    }
    //널값체크
    function check() {
//         alert("check 클릭!");
        var checkValue = document.f.branch_name.value;
        alert("checkValue : "+checkValue);
        if(checkValue == ""){
            alert("업체이름을 입력하세요.");
            document.f.branch_name.focus();
            return false;
        }
        
    }
</script>
</head>
<body>
<div ng-app="myApp" ng-controller="myCtrl" >
     <table border="1" width="100%">
        <thead>
            <tr align="center">
                <td>업체이름 검색 : <input onkeypress="if (event.which==13) document.getElementById('ddd').click()" type="text" name="branch_name" size="15" ng-model="user" value=""/>
                    <input type="button" id='ddd' ng-click="search()" value="검색">
                </td>
            </tr>
            </thead>
            <tbody>
                <tr ng-repeat="post in posts">
                    <td><a id="branch_name" href='javascript:sendAdd("{{post.branch_name}}","{{post.branch_no}}")' >
                     {{post.branch_tel}} {{post.branch_local}} {{post.branch_name}} 
                    </a></td>
                </tr>
                </tbody>
        </table>
</div>
<script>
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope, $http) {
		$scope.search = function() {
			if ($scope.user != "" && $scope.user != null) {
				$http.get("./apost", {
					params : {
						user : $scope.user
					}
				}).then(function(response) {
					$scope.posts = response.data;
				});
			}else{
				alert("검색명을 입력해주세요");
			}
			}
	});
</script>
</body>
</html>


