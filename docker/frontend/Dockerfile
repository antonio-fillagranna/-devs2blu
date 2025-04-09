FROM node:20 AS build
WORKDIR /app

COPY app-frontend/package*.json ./
RUN npm install

COPY ./app-frontend .

RUN npx ng build --configuration production

FROM nginx:alpine
COPY --from=build /app/dist/ /usr/share/nginx/html

# Copia configuração customizada opcional do Nginx (se necessário)
# COPY nginx.conf /etc/nginx/nginx.conf
