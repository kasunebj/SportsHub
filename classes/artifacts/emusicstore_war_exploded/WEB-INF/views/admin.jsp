
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Administrator Page</h1>

            <p class="lead">this is administrator page!</p>
        </div>

        <h3>
            <a href="<c:url value="/admin/productInventory"/>">Product Inventory</a>
        </h3>

    <p>Here you can check add modify product inventory</p>

<%@include file="/WEB-INF/views/template/footer.jsp"%>