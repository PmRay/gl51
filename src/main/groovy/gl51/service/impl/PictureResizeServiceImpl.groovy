package gl51.service.impl

import gl51.data.Picture
import gl51.service.picture.PictureResizeService
import gl51.service.picture.PictureService

import javax.inject.Inject

class PictureResizeServiceImpl implements PictureResizeService {

    @Inject PictureService pictureService

    @Override
    Picture resize() {
    }

}
