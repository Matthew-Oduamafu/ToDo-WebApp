
<html>
<head>
    <title>Your ToDos</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }

        .container {
            width: 80%;
            margin: auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }

        table {
            width: 100%;
            margin-top: 20px;
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th, td {
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: white;
        }

        button {
            margin: 5px;
            padding: 5px 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Your ToDos</h1>
    <table>
        <thead>
        <tr>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is it Done?</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <!-- Example row -->
        <tr>
            <td>Example ToDo</td>
            <td>2023-04-01</td>
            <td>false</td>
            <td>
                <button>Update</button>
                <button>Delete</button>
            </td>
        </tr>
        <!-- You can loop through your ToDo items here using JSTL c:forEach tag -->
        </tbody>
    </table>
</div>
</body>
</html>