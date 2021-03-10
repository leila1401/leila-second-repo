<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>

<h1>WELCOME ${name} TO MY TODO LIST:</h1>

<div class="container">
		<table class="table table-striped">
			<caption>Your Todos are</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Date</th>
					<th>Completed</th>
					<th>Delete</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td>
							<a type="button" class="btn btn-danger" 
								href="/delete-todo?id=${todo.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a type="button" class="btn btn-success" href="/add-todo">Add New Todo</a>
		</div>
	</div>



<%@ include file="./common/footer.jspf"%>