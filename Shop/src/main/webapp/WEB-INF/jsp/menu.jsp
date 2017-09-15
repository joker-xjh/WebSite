
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="span10 last">
	<div class="topNav clearfix">
		<ul>
			<c:if test="${sessionScope.user == null}">
				<li id="headerLogin" class="headerLogin" style="display: list-item;">
					<a href="${ pageContext.request.contextPath }/userLogin">login</a>|
				</li>
				<li id="headerRegister" class="headerRegister"
					style="display: list-item;"><a
					href="${ pageContext.request.contextPath }/userRegister">regist</a>|</li>
			</c:if>
			
			<c:if test="${sessionScope.user != null }">
			
				 <li id="headerLogin" class="headerLogin" style="display: list-item;">
                    <c:out value="${user.username }"/>
                </li>
                <li id="headerLogin" class="headerLogin" style="display: list-item;">
                    <a href="${ pageContext.request.contextPath }/findOrderByUid/1">my orders</a>
                    |
                </li>
                <li id="headerRegister" class="headerRegister"
                    style="display: list-item;">
                    <a href="${ pageContext.request.contextPath }/quit">exit</a>|
                </li>
			
			</c:if>
			


		</ul>


	</div>
	
	 <div class="cart">
        <a href="${pageContext.request.contextPath}/myCart">Car</a>
    </div>

</div>


<div class="span24">
 <ul class="mainNav">
  <li><a href="${ pageContext.request.contextPath }/index">index</a>|</li>
  
  <c:forEach items="categoryList" var = "category">
  <li>
  <a href = "/findByCid/<c:out value = "${category.cid }" />/1">
   <c:out value="${category.cname }" default=""></c:out>
  </a>
  </li>
  </c:forEach>
 
 
 

  </ul>



</div>















