# Gerenciador de estoque - Mercadinho do seu Zé 👋🥸
<div  display="flex" , align="center"> 
<p align="left">
  <a href="https://skillicons.dev">

  </a>
</p>
</div>

## Arquitetura
<img width="530px" height="400" src="https://github.com/AnesioSousa/api-estoque-springboot/blob/main/arch.png" />

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

3. Quando o deployment do postgres estiver no estado "Ready" como na segunda imagem abaixo, aplique o manifesto de criação do App:
   <div style="display: flex; align=center">
    <img width="700" alt="image" src="https://github.com/AnesioSousa/api-estoque-springboot/assets/39014361/0539baaa-86cc-4d51-a53d-93be4a2add3b">
    <br/>
    <img width="700" alt="image" src="https://github.com/AnesioSousa/api-estoque-springboot/assets/39014361/de45e123-b0a1-4576-b6df-c3812c688cc9">
     
   </div>

   
   ```
   kubectl apply -f specs/webapp.yaml
   ```
5. Pronto! você já tem um App configurado e funcionando! Digite para visualizar tudo o que foi construido:
   ```
   kubectl get all
   ```

# Uso
1. Executando no minikube:
   ```
   minikube service webapp-service
   ```
   <img width="700" alt="image" src="https://github.com/AnesioSousa/api-estoque-springboot/assets/39014361/efea80c4-0830-4c47-88a2-2c167c87ae58">
2. Agora basta acessar link
   `http://localhost/<porta-do-web-app-gerada>`
   <br/>
   <br/>
   <br/>
   <br/>
7. Apagar tudo no cluster (executando no minikube)
   ```
   minikube delete
   ```
# Contribuindo ao projeto
Sentiu vontade de dar uma forcinha? Você pode relizar um pull request. Vai deixar um dev mais feliz! Também pode relatar algum problema na aba "issues". Até mais👋.

