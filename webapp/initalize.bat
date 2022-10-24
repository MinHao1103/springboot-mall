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
echo Successfully installed
echo -------------------------------------
pause