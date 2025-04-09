# Build stage
FROM node:20 as build
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod

# Nginx stage
FROM nginx:alpine
COPY --from=build /app/dist/ /usr/share/nginx/html