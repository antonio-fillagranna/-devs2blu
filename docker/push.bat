@echo off
set USER=antonio.fillagranna

echo.
echo ===== Construindo imagens =====

docker build -t %USER%/angular-frontend ./frontend
docker build -t %USER%/express-backend ./backend

:: opcional, se tiver Dockerfile custom do banco
:: docker build -t %USER%/postgres-db ./db

echo.
echo ===== Enviando para o Docker Hub =====

docker push %USER%/angular-frontend
docker push %USER%/express-backend

:: opcional
:: docker push %USER%/postgres-db

echo.
echo ===== Finalizado com sucesso =====
pause
