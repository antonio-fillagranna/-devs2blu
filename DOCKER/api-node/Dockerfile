# Usa a imagem oficial do Node.js como base
FROM node:18-alpine

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia os arquivos package.json e package-lock.json para o container
COPY package*.json ./

# Instala as dependências da aplicação
RUN npm install

# Copia o restante dos arquivos para o container
COPY . .

# Expõe a porta 3000
EXPOSE 3000

# Comando para iniciar a aplicação CMD ["node", "server"]
CMD ["npm", "start"]
