provider "aws" {
 region = "us-east-1"
}

resource "aws_ecr_repository" "app" {
 name = "springboot-app"
}

resource "aws_ecs_cluster" "cluster" {
 name = "springboot-cluster"
}

resource "aws_db_instance" "mysql" {
 engine = "mysql"
 instance_class = "db.t3.micro"
 allocated_storage = 20
 username = "admin"
 password = "password123"
 skip_final_snapshot = true
}
