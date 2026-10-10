from dotenv import load_dotenv_values
import os


# Loading environment values
def load_environment():
    environment = os.getenv("ENVIRONMENT")
    env_file = f".env.{environment}" if environment else ".env"
    return load_dotenv_values(env_file)