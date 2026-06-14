# Use official Node.js LTS image (lightweight Alpine variant)
FROM node:18-alpine

# Set working directory inside the container
WORKDIR /app

# Copy package files first (better layer caching)
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Expose port 8080
EXPOSE 8080

# Command to run the app
CMD ["npm", "start"]
