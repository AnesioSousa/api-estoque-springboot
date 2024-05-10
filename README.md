# Gerenciador de estoque - Mercadinho do seu Zé


## Quick Start
Para aplicar os manifestos é preciso que:
- Um cluster do Kubernetes com a ferramenta de linha de comando (cli) kubectl esteja instalado e configurado para uso.
- A cli do docker esteja instalada. Você deve estar logado em usa conta do Docker Hub. Caso não esteja logado utilize o
  seguinte comando em algum terminal e forneça usuário e senha:
  
  ```
  docker login
  ```
## Implantando um app Spring Boot e um banco de dados para ele no ambiente do Kubernetes
1. Aplique o manifesto de criação do ConfigMap:
   
   ```
   kubectl apply -f specs/postgres-config.yaml
   ```
3. Aplique o manifesto de criação do Secret:
 
   ```
   kubectl apply -f specs/postgres-secret.yaml
   ```
5. Aplique o manifesto de criação do Postgres:

   ```
   kubectl apply -f specs/postgres.yaml
   ```

3. Quando o deployment do postgres estiver no estado "Ready", aplique o manifesto de criação do App:
   
   ```
   kubectl apply -f specs/webapp.yaml
   ```
4. Pronto! você já tem um App configurado e funcionando! Digite:
   ```
   kubectl get all
   ```
5. Executando no minikube:
   ```
   minikube service webapp-service
   ```

6. Apagar tudo no cluster (executando no minikube)
   ```
   minikube delete
   ```
