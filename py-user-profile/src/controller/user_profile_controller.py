from fastapi import APIRouter, routing
from src.constants.constants import USER_PROFILE_URL, USER_PROFILE_TAGS
from src.model.user_profile_dto import UserProfileDto
from src.service.user_profile_service import create_user_profile as create_user_profile_service

user_profile_route = APIRouter(
    prefix=USER_PROFILE_URL,
    tags=[USER_PROFILE_TAGS],
)



@user_profile_route.post("")
async def create_user_profile(user_profile_dto: UserProfileDto):
    return await create_user_profile_service(user_profile_dto)