@echo off
echo === LOGIN DOCKER HUB ===
set /p USERNAME=Digite seu usuário Docker Hub: 
set /p PASSWORD=Digite sua senha Docker Hub (será visível): 

echo.
echo Efetuando login...
echo %PASSWORD% | docker login -u %USERNAME% --password-stdin

if %errorlevel%==0 (
    echo Login realizado com sucesso!
) else (
    echo ERRO: Falha no login.
)
pause
