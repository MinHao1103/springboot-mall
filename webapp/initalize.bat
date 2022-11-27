@echo off
echo -------------------------------------
echo Initializing, please later.
echo -------------------------------------
call npm install
echo.
echo.
echo -------------------------------------
echo Installing jquery
echo -------------------------------------
call npm i jquery
call npm i @types/jquery --save-dev
echo.
echo.
echo -------------------------------------
echo Installing Json server
echo -------------------------------------
call npm install -g json-server
echo.
echo.
echo -------------------------------------
echo Installing Sweetalert2
echo -------------------------------------
call npm i sweetalert2
echo.
echo.
echo -------------------------------------
echo Installing Google OAuth 2.0
echo -------------------------------------
cd..
call npm i angularx-social-login
echo.
echo.
echo -------------------------------------
echo Successfully installed
echo -------------------------------------
pause
