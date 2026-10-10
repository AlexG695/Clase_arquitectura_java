export ENVIRONMENT=dev

python -m uvicorn src.main:app --reload --host 0.0.0.0 --port 8000

# python -B src/main.py
