from motor.motor_asyncio import AsyncIOMotorClient
from src.environment.load_environment import load_environment


env = load_environment()

MONGODB_URL = env.get("MONGODB_URL")

def get_database_connection(collection:str) -> AsyncIOMotorClient :
    client = AsyncIOMotorClient(MONGODB_URL)
    return client.user_profile.get_collection(collection)