<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background-color: #fff;
            padding: 60px; /* Increased padding */
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px; /* Set a specific width */
        }
        .login-container h2 {
            text-align: center;
            color: #333;
        }
        .form-group {
            margin-bottom: 25px; /* Increased margin */
        }
        .form-group label {
            display: block;
            color: #666;
            margin-bottom: 10px; /* Increased margin */
        }
        .form-group input {
            width: 100%;
            padding: 15px; /* Increased padding */
            border: 1px solid #ddd;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 16px; /* Increased font size */
        }
        .form-group input:focus {
            outline: none;
            border-color: #4A90E2;
        }
        .login-button {
            width: 100%;
            padding: 15px; /* Increased padding */
            background-color: #4A90E2;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 18px; /* Increased font size */
        }
        .login-button:hover {
            background-color: #357ABD;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <p>Enter your username and password to login.</p>
    <p style="color: red;">${errorMessage}</p>
    <form method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
        </div>
        <button type="submit" class="login-button">Login</button>
    </form>
</div>
</body>
</html>