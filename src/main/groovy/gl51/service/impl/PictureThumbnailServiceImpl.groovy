package gl51.service.impl

import gl51.data.Picture
import gl51.service.Picture.PictureFiligraneService
import gl51.service.Picture.PictureService
import gl51.service.Picture.PictureThumbnailService

import javax.inject.Inject

class PictureThumbnailServiceImpl implements PictureThumbnailService {

    @Inject PictureService pictureService
    @Inject PictureFiligraneService pictureFiligraneService

    @Override
    Picture createThumbnail() {

    }
}
