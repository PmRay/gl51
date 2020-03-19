package gl51.service

import gl51.data.Picture

interface PictureThumbnailService {
// Créer un thumbnail 50*50
    Picture createThumbnail()

}