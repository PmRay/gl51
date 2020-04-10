package gl51.service.impl

import gl51.data.Picture
import gl51.service.picture.PictureFiligraneService
import gl51.service.picture.PictureService
import gl51.service.picture.PictureThumbnailService

import javax.inject.Inject

class PictureThumbnailServiceImpl implements PictureThumbnailService {

    @Inject PictureService pictureService
    @Inject PictureFiligraneService pictureFiligraneService

    @Override
    Picture creationThumbnail() {
        return null
    }
}
