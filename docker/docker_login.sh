#!/bin/bash

echo "=== LOGIN DOCKER HUB ==="
read -p "Digite seu usuário Docker Hub: " USERNAME
read -s -p "Digite sua senha Docker Hub: " PASSWORD
echo

echo "$PASSWORD" | docker login -u "$USERNAME" --password-stdin

if [ $? -eq 0 ]; then
    echo "Login realizado com sucesso!"
else
    echo "ERRO: Falha no login."
fi
