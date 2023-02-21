.DEFAULT_GOAL := help

.PHONY: build
run: ## Build project
	sbt build

.PHONY: clean
run: ## Clean project
	sbt clean

.PHONY: run
run: ## Run project
	sbt run

.PHONY: test
test: ## Run tests
	sbt test

.PHONY: help
help: ## Help
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'