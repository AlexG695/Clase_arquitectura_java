from pydantic import BaseModel, Field


class UserProfileDto(BaseModel):
    user_name: str = Field(min_length=2, max_length=20)
    user_rol: str = Field(min_length=2, max_length=20)
