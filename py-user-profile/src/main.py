from fastapi import FastAPI
from src.controller.user_profile_controller import user_profile_route

app = FastAPI()

app.include_router(user_profile_route)