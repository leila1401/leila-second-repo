<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>

<h1>WELCOME TO ADD TODO:</h1>
<div class="container">
	Your New Action Item:
	<form method="POST" action="/add-todo">
		<fieldset class="form-group">
			<label>Description</label> <input name="description" type="text"
				class="form-control" /> <BR />
		</fieldset>
		<input name="add" type="submit" class="btn btn-success" value="Submit" />
	</form>
</div>

<%@ include file="./common/footer.jspf"%>