from src.model.user_profile_dto import UserProfileDto
from src.database.database import get_database_connection
from src.constants.constants import USER_PROFILE_COLLECTION

async def create_user_profile(user_profile_dto: UserProfileDto):
    user_profile_model = user_profile_dto.model_dump()
    created_id = await get_database_connection(USER_PROFILE_COLLECTION).insert_one(user_profile_model)

    return {"id": str(created_id.inserted_id)}